from pydub import AudioSegment
from pydub.playback import play
import time

# Dictionary of alphanumeric and their respective morse code
code = {'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....',
        'I': '..', 'J': '.---', 'K': '-.-', 'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.',
        'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-', 'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-',
        'Y': '-.--', 'Z': '--..', '1': '.----', '2': '..---', '3': '...--', '4': '....-', '5': '.....',
        '6': '-....', '7': '--...', '8': '---..', '9': '----.', '0': '-----', ' ': ' '}

# List of alphanumeric for check
alpha_list = list(code.keys()) + [' ']

def morse_to_alphanumeric(morse):
    check = all(c in '.- ' for c in morse)

    if check:
        def morse_to_char(morse):
            for k, v in code.items():
                if v == morse:
                    return k
            return ''

        k = 0
        message = ''
        while k < len(morse):
            space = False
            morse_char = ''
            while k < len(morse) and morse[k] != ' ':
                morse_char += morse[k]
                k += 1

            if k < len(morse) - 1 and morse[k + 1] == ' ':
                space = True

            message += morse_to_char(morse_char)
            if space:
                message += ' '
                k += 1
            k += 1

        return message.strip()

    return 'Enter Valid Morse Code'


def alpha_to_morse(message):
    if all(c.upper() in alpha_list for c in message):
        morse = ' '.join(code[c.upper()] for c in message)
        return morse
    return 'Only Alphabets and Numbers are accepted'

# Play the sound respect to the morse
def morse_play(morse):
    for i in morse:
        if i == '-':
            print("Playing 'dat.wav'")
            sound = AudioSegment.from_file("dat.wav")
            play(sound)
            time.sleep(0.1)
        elif i == '.':
            print("Playing 'dit.wav'")
            sound = AudioSegment.from_file("dit.wav")
            play(sound)
            time.sleep(0.1)
        elif i == ' ':
            print("Space")
            time.sleep(0.3)

def main():
    while True:
        print("Select an option from below:")
        print("1. Translate English text to Morse Code")
        print("2. Translate Morse Code to English text")
        print("3. Play Morse Code sound")
        print("4. Exit")

        try:
            option = int(input("Enter your choice (1, 2, 3, or 4): "))
            if option == 1:
                english_text = input("Enter the English text: ")
                morse_code = alpha_to_morse(english_text)
                print(f"Morse Code: {morse_code}")
            elif option == 2:
                morse_code = input("Enter the Morse code: ")
                english_text = morse_to_alphanumeric(morse_code)
                print(f"English Text: {english_text}")
            elif option == 3:
                morse_code = input("Enter the Morse code to play: ")
                morse_play(morse_code)
            elif option == 4:
                print("Exiting...")
                break
            else:
                print("Invalid option. Please enter a number between 1 and 4.")
        except ValueError:
            print("Invalid input. Please enter a valid number.")

if __name__ == "__main__":
    main()
