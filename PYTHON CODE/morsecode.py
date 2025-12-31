#import library
import time

#dictionary
morse_code_dict = {
    'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....', 'I': '..', 'J': '.---',
    'K': '-.-', 'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.', 'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-',
    'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-', 'Y': '-.--', 'Z': '--..',
    '0': '-----', '1': '.----', '2': '..---', '3': '...--', '4': '....-', '5': '.....', '6': '-....', '7': '--...',
    '8': '---..', '9': '----.',
    '.': '.-.-.-', ',': '--..--', '?': '..--..', "'": '.----.', '!': '-.-.--', '/': '-..-.', '(': '-.--.', ')': '-.--.-',
    '&': '.-...', ':': '---...', ';': '-.-.-.', '=': '-...-', '+': '.-.-.', '-': '-....-', '_': '..--.-', '"': '.-..-.',
    '$': '...-..-', '@': '.--.-.', ' ': '/'
}

#definition
def transalate_to_morse_code(text):
    morse_code=''
    for char in text:
        if char.upper() in morse_code_dict:
            morse_code += morse_code_dict[char.upper()] + ' '

        else:
            morse_code += char + ' '
    return morse_code

#main
while True:
    print('''Select an option from below:
    1. Translate English text to Morse Code
    2. Exit''')

    inp=int(input("Enter the English text: "))

    if inp==1:
        english_text = input("Enter English text: ")
        morse_code_text = transalate_to_morse_code(english_text)
        print("Morse Code Transalation: ", morse_code_text)

    elif inp==2:
        print("Exiting program...")
        time.sleep(4)
        break
    break