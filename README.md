## Projektidé

En till två meningar: vilken domän, och vad programmet ska göra.

Gym medlemskap där man har koll på vilka kunder har vilket medlemskap och vilka är aktiva eller utgående.


## Superklass

- Namn: Gym medlemssytem.
- Gemensamma fält: name, id number.
- Gemensamma metoder: Addmember(), removemember(), searchmember(), bookclass().

## Subklasser (minst tre)

1. Standard medlemskap — override - addmember() för att registrera medlemmen.
2. Premium medlemskap — override - bookclass() för att medlemmen kan boka classes.
3. Student medlemskap — override - searchmember() för att visa studenten och vilken hen går.

## Interface

- Namn: Bookable
- Metod(er): bookable()
- Implementeras av (minst två subklasser): Standard, premium.

## Meny
- Addmember()
- Removemember()
- Searchmember()
- Displayallmembers()
- Showstatistics()
- Bookclass()
- Exit()

Lista minst fyra åtgärder kopplade till samlingen (t.ex. lägga till, ta bort, söka, samt en egen åtgärd som passar er domän).

## Felscenarion

Minst två konkreta situationer i just ert program som kan gå fel och som ni behöver hantera (inte generella exempel).

Man ska kan inte lägga till eller tar bort medlemmar utan medlem id .
För att medlemmen ska inte boka group training om den inte tillhör till den typen som kan boka group training.

## Motivering (fylls i senare i veckan)

När ni kommit igång och gjort några ändringar: skriv kort varför strukturen ser ut som den gör, och om ni övervägde ett annat sätt att lösa det på. Detta behöver inte fyllas i redan i första commiten.
Jag ska skapat en till class för att hantera alla metoder och jag ville inte ha för mycket information i main.
