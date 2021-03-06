## Bangkit 2021 Capstone Project
This is the Capstone Project of team B21-CAP0209 for Bangkit 2021


# SignForYou

## Overview

Speech impairment is a disability which affects an individuals ability to communicate using speech and hearing. Although sign language is ubiquitous in recent times, there remains a challenge for non-sign language speakers to communicate with sign language speakers or signers. With recent advances in deep learning and computer vision there has been promising progress in the fields of motion and gesture recognition using deep learning and computer vision based techniques. The focus of this work is to create a vision-based application that offers sign language translation to text thus aiding communication between signers and non-signers.
  - Machine Learning : Perform in depth literature review, create dataset using Teachable Machine, Building models with transfer learning, convert model to TensorFlow lite and using data pipeline to serve the model.
  - Android : Design UI/UX of the App, Connect project to firebase,Implement ML model with tflite file from firebase ML, Create Mini Dictionary (A-Z) with sample image from firebase, Create Help Explanation Page
  - Cloud: Made a project in google cloud platform, manage IAM roles, creating alerting for billing, then connect the GCP project in firebase, upload the ML model in machine learning (custom), create a bucket with firestore, create business / go-to market proposal.

## Model
On this project we use transfer learning with EfficientNet as base model. The model is saved to tflite format.
The model notebook and it's tflite files can be seen at this link: https://github.com/KhresnaPanduI/ASL_modelmaker/

## Translation Demo
Steps to use translate feature:
1. on the top line, the application will detect the letters in realtime
2. wait until the letters that are detected doesn't change
3. press the checklist button to store letters

https://user-images.githubusercontent.com/65539981/121313975-21a56500-c931-11eb-9b88-e1b2f0465c59.mp4

## Screenshot
<img src="https://user-images.githubusercontent.com/48057016/120464700-6bd59600-c3c7-11eb-8f11-130da17a6b82.jpg" width=200>
<img src="https://user-images.githubusercontent.com/48057016/120464709-6e37f000-c3c7-11eb-88d4-9e23d4bd9b4f.jpg" width=200>
<img src="https://user-images.githubusercontent.com/48057016/120464720-7132e080-c3c7-11eb-993f-07eb2f2e1781.jpg" width=200>
<img src="https://user-images.githubusercontent.com/48057016/120464731-73953a80-c3c7-11eb-8ab5-5fdcb8a062e4.jpg" width=200>
<img src="https://user-images.githubusercontent.com/48057016/120464650-5d877a00-c3c7-11eb-8205-3b652d9ef5a1.jpg" width=200>

## Running application
1. Open terminal and enter git clone https://github.com/fariqkr/SignForYou 
2. Start Android Studio
3. Open the project within SignForYou folder
4. Connect project to Firebase
5. Upload ML model to firebase
6. Run the project with Android Studio using either the emulator or physical device
