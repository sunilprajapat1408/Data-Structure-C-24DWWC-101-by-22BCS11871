import speech_recognition as sr
import pyttsx3
import schedule
import time
import os
import webbrowser
import wikipedia
import openai

# Initialize the recognizer and text-to-speech engine
recognizer = sr.Recognizer()
engine = pyttsx3.init()

# OpenAI API Key (Make sure to set your API key)
openai.api_key = 'your_openai_api_key_here'

# Function to make the assistant speak
def speak(text):
    engine.say(text)
    engine.runAndWait()

# Function to listen to user input
def listen():
    with sr.Microphone() as source:
        print("Listening...")
        audio = recognizer.listen(source)
        try:
            text = recognizer.recognize_google(audio)
            print(f"You said: {text}")
            return text.lower()
        except sr.UnknownValueError:
            speak("Sorry, I didn't catch that. Could you repeat?")
            return listen()
        except sr.RequestError:
            speak("Sorry, I'm having trouble connecting to the service.")
            return None

# Function to manage schedules
def manage_schedule():
    speak("What would you like to schedule?")
    task = listen()
    speak("When should I remind you?")
    time_input = listen()
    # Add scheduling logic here
    schedule.every().day.at(time_input).do(lambda: speak(f"Reminder: {task}"))
    speak(f"Scheduled {task} at {time_input}.")

# Function to open applications
def open_application(app_name):
    if "notepad" in app_name:
        os.system("notepad")
    elif "calculator" in app_name:
        os.system("calc")
    elif "chrome" in app_name:
        webbrowser.get("chrome").open("https://www.google.com")
    else:
        speak(f"Sorry, I can't open {app_name} yet.")

# Function to perform Google search
def google_search(query):
    speak("Searching Google for you...")
    webbrowser.open(f"https://www.google.com/search?q={query}")

# Function to get Wikipedia summary
def search_wikipedia(query):
    speak("Searching Wikipedia...")
    summary = wikipedia.summary(query, sentences=2)
    speak(summary)

# Function to interact with ChatGPT
def chat_with_gpt(prompt):
    response = openai.Completion.create(
        engine="text-davinci-003",
        prompt=prompt,
        max_tokens=100
    )
    speak(response.choices[0].text.strip())

# Function to handle commands
def handle_command(command):
    if "schedule" in command:
        manage_schedule()
    elif "open" in command:
        app_name = command.replace("open", "").strip()
        open_application(app_name)
    elif "google" in command:
        query = command.replace("google", "").strip()
        google_search(query)
    elif "wikipedia" in command:
        query = command.replace("wikipedia", "").strip()
        search_wikipedia(query)
    elif "chat" in command or "ai" in command:
        prompt = command.replace("chat", "").replace("ai", "").strip()
        chat_with_gpt(prompt)
    else:
        speak("Sorry, I don't understand that command.")

# Main function to run the assistant
def run_assistant():
    speak("Hello! How can I assist you today?")
    while True:
        command = listen()
        if command:
            if "exit" in command or "quit" in command:
                speak("Goodbye!")
                break
            handle_command(command)
        schedule.run_pending()
        time.sleep(1)

# Run the assistant
run_assistant()
