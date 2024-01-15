import tkinter as tk
import random
from tkinter import *
from PIL import Image, ImageTk

def gen_pass():
    password_length = int(length_entry.get())
    if password_length < 8:
        result_label.config(text="Password length must be at least 8 characters")
    else:
        characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ12334567890!@#$%^&*_"
        password = ''.join(random.choice(characters) for _ in range(password_length))
        result_label.config(text="Generated Password: " + password)

root = Tk()
root.title("Password Generator")
root.geometry("500x400+100+100")
root.resizable(False, False)
icon = PhotoImage(file="randoms\codsoft\img\pass.png")
root.iconphoto(False, icon)

label = tk.Label(root, text="Welcome", bg="#4406a1", fg="white")
label.pack(fill='x')  # Set fill option to 'x'
label = tk.Label(root, text="THE PASSWORD GENERATOR", font="cambria", bg="#4406a1", fg="white")
label.pack(fill='x')
label = tk.Label(root, bg="#4406a1")
label.pack(fill='x')

length_label = tk.Label(root, text="Enter Password Length:", font=("JetBrainsMono-Medium", 12))
length_label.pack(fill='x')
length_entry = tk.Entry(root, width=5)
length_entry.place(height='12px', width='200px')
length_entry.pack()


image = Image.open("randoms\codsoft\img\gen.png")
resize_image = image.resize((100, 100))

gen_ico = ImageTk.PhotoImage(resize_image)

gen_button=tk.Button(root,image=gen_ico,bd=0,command=gen_pass)
gen_button.place(x=200, y=200)
result_label = tk.Label(root, text="", wraplength=300, justify="center")
result_label.pack()

root.mainloop()