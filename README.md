## Projektidé

En till två meningar: vilken domän, och vad programmet ska göra.

Gym medlemskap där man har koll på vilka kunder har vilket medlemskap och vilka är aktiva eller utgående.


## Superklass

- Namn: Gym medlemssytem.
- Gemensamma fält: name, id number.
- Gemensamma metoder: Addmember(), removemember(), search(), bookclass().

## Subklasser (minst tre)

1. Standard medlemskap — override - addmember() för att registrera medlemmen.
2. Premium medlemskap — override - bookclass() för att medlemmen kan boka classes.
3. Student medlemskap — override - searchmember() för att visa studenten har studenkort.

## Interface

- Namn: Bookable
- Metod(er): bookable()
- Implementeras av (minst två subklasser): Standard, premium.

## Meny
- Addmember()
- Removemember()
- Search()
- Displayallmembers()
- Showstatistics()
- Bookclass()
- Exit()

Lista minst fyra åtgärder kopplade till samlingen (t.ex. lägga till, ta bort, söka, samt en egen åtgärd som passar er domän).

## Felscenarion

Minst två konkreta situationer i just ert program som kan gå fel och som ni behöver hantera (inte generella exempel).

För att man ska inte överboka klassen mer än det tar.
För att barn ska inte köpa student medlemskap utan student kort.

## Motivering (fylls i senare i veckan)

När ni kommit igång och gjort några ändringar: skriv kort varför strukturen ser ut som den gör, och om ni övervägde ett annat sätt att lösa det på. Detta behöver inte fyllas i redan i första commiten.
