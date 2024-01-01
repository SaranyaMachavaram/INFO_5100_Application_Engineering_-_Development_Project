# AED_Final_Project

Design Document, Context and Models

1.0	INTRODUCTION

1.0	Purpose of this document

The purpose of this document is to implement the server and client side of Intensive Pet Care Management application

2.0   Definitions and Acronyms

Java Swing: It is a GUI toolkit for Java and is a part of Oracle’s Java classes. It is an API for providing GUI elements to Programs of java.
Db4o: It is an object database for java

3.0 Project Overview

The project aim is to enhance and create a better health care services to animals by implementing an online system for pet owners where they can enable to register the pets under hospitals and health camps according to their preference and convenience.

4.0 Scope

1. Creation of Java Swing application for Intensive Pet Care system application

5.0 Hardware and Software Requirement

1. Hardware Requirement:

		a. Developer PC 
2. Software Requirement:

		a. NetBeans software
		b. Java 18
		c. db4o jar file
		d. Java jar files such as AbsoluteLayout.jar, javax.activation, javax.mail, jfreechart

2.0 System Diagram:

![image](https://user-images.githubusercontent.com/114721139/206951492-b24524ae-77d7-45c0-968b-47d131dfdd4b.png)

3.0 Flow of the application

	Steps Explanation:
1.	System admin will create logins for hospital admin, pet volunteer admin, health camp admin, sponsor admin, fundraiser admins, driver admin
2.	Hospital admin can login into the system and can manage hospital information, manage vet information, manage lab assistant and then logout.
3.	Health camp admin can manage organization information.
4.	 Pet Volunteer admin logins and can register for health camp.
5.	Health camp admin can manage pet volunteers by logging into the system
6.	Hospital admin can login and manage pet volunteer information
7.	Vet can assign the pet to lab assistant by entering into the system
8.	Lab assistant can change status result by logging into system.
9.	Driver can login and change the status of drop off status of pet
10.	 Funds raiser volunteer can add sponsor
11.	Sponsor can add the amount 
12.	Funds raiser volunteer can check the sponsor status

Roles:

1.	System Admin
2.	Hospital Admin
3.	Health Camp Admin
4.	Lab Assistant
5.	Vet
6.	Fundraiser volunteer
7.	Driver
8.	Pet volunteer
9.	Sponsor
 
Enterprises:
	
1.	Logistics
2.	Hospital
3.	Health Camp
4.	Fundraiser

Organizations:

1.  Driver system
2.  Sponsor
3.  Fundraising agency
4.  Vet system
5.  Pet Volunteer system
6.  Hospital
7.  Health Camp
8.  Lab

Model:

Driver class:

![image](https://user-images.githubusercontent.com/114721139/206952469-a2fe1c7f-43c9-4c19-b380-e7846ae75d12.png)

Fund Raising class:

![image](https://user-images.githubusercontent.com/114721139/206952498-58a05c0c-c6ce-4880-aec8-112b58987548.png)

Health Camp class:

![image](https://user-images.githubusercontent.com/114721139/206952548-d270e51b-50db-43b1-b683-eac92d580b48.png)

Hospital class:

![image](https://user-images.githubusercontent.com/114721139/206952572-e42edc35-ed6f-4f43-9b1b-203c921579c3.png)


Lab Assistant class:

![image](https://user-images.githubusercontent.com/114721139/206952597-ddc37be3-3652-4a21-abbd-86ce740e2eee.png)


Person class::

![image](https://user-images.githubusercontent.com/114721139/206952620-a43a0b72-e8c4-41e6-aa6e-4bd98cf54562.png)

Pet Volunteer class:

![image](https://user-images.githubusercontent.com/114721139/206952649-de94dcdb-e397-4ded-83ae-97a5b27499cd.png)

Sponsor class:

![image](https://user-images.githubusercontent.com/114721139/206952666-4fc97e88-d804-44e8-9e1f-296f8d19f225.png)

Vet class::

![image](https://user-images.githubusercontent.com/114721139/206952716-ad6cea59-2f86-48a3-bced-ec630de09ab6.png)

Class Diagram:
![Class Diagram](https://user-images.githubusercontent.com/114721139/206950356-fec90464-1f89-4c4d-b0d0-0bfccb99706c.png)

Sequence Diagram:

System Admin:

<img width="464" alt="image" src="https://user-images.githubusercontent.com/114721139/206951003-8baa6f17-f21f-4b1f-b635-99d2efe71a33.png">

Hospital Admin:

<img width="496" alt="image" src="https://user-images.githubusercontent.com/114721139/206951064-ee11e5d8-8ab8-4168-aafe-77f8a601c8e0.png">

Pet Volunteer:

<img width="206" alt="image" src="https://user-images.githubusercontent.com/114721139/206951087-4e16c0e5-f917-43fe-a8c8-1f4354030b7b.png">

Health Camp:

<img width="323" alt="image" src="https://user-images.githubusercontent.com/114721139/206951110-00ffebfb-ef8c-47b0-abbd-41776d4f6de8.png">

Sponsor Admin:

<img width="246" alt="image" src="https://user-images.githubusercontent.com/114721139/206951136-8a8ea563-e20d-4d50-ba11-62857efde790.png">

FundRaiser Admin:

<img width="244" alt="image" src="https://user-images.githubusercontent.com/114721139/206951164-c1c7a4b0-dbc1-434e-9587-1813424db47f.png">

Driver Admin:

<img width="236" alt="image" src="https://user-images.githubusercontent.com/114721139/206951190-462ea6bb-399c-472d-89c5-c231522adf14.png">

Vet Admin:

<img width="275" alt="image" src="https://user-images.githubusercontent.com/114721139/206951215-49e8c3c4-ff7c-475b-9ad2-6273612c549c.png">

Lab Assistant:

<img width="314" alt="image" src="https://user-images.githubusercontent.com/114721139/206951236-58a65506-5189-49ca-bca3-1ad1a5bb2090.png">


Project By:

Varsha Kuruva

Sri Poojitha Mandali

Saranya Machavaram


