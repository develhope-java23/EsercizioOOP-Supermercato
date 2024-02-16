**Esercizio OOP**

Aggiungere getter, setter o metodi oltre a quelli richiesti dove si ritiene necessario.

- Implementare una classe "Product" che rappresenta un prodotto disponibile in un supermercato. Un prodotto è definito da un nome, una quantità ed un prezzo unitario. La classe deve fornire i seguenti metodi:
	- getTotalPrice(): Ritorna il prezzo totale del prodotto, derivato moltiplicando la quantità per il prezzo unitario.-
	- extract(quantity: int): Ritorna un nuovo oggetto Product con gli stessi attributi di quello su cui viene chiamato il metodo, ma con quantità uguale a quella passata come parametro. La quantità dell'oggetto originale viene ridotta dello stesso valore. Nel caso in cui la quantità dell'oggetto sia minore di quella passata come parametro, viene ritornato "null" e stampato un errore a schermo. 

- Implementare una classe "Cart" che rappresenta un carrello della spesa. Un carrello è definito da un un insieme di prodotti presenti del carrello ed un budget di spesa massimo. La classe deve fornire i seguenti metodi:
	- getTotalPrice(): Ritorna il prezzo totale del carrello, calcolate sommando il prezzo dei prodotti presenti in esso 
	- addProduct(product: Product): Aggiunge un prodotto al carrello. Se il prezzo totale che si raggiungerebbe agggiungendo il prodotto supera il limite di spesa, il carrello non viene modificato e viene stampato un messaggio di errore a schermo.


- Implementare una classe "Supermarket" che rappresenta un supermercato, definito da un array di "Product" disponibili nel magazzino del supermercato. Il numero massimo di prodotti e la quantità massima, intesa come la somma di tutti i prodotti disponibili in magazzino, sono fissati alla creazione dell'oggetto passandoli come parametri al costruttore.. La classe deve fornire i seguenti metodi:
	- add(product: Product): Aggiunge il prodotto al magazzino del supermercato. Se non c'è spazio in magazzino, viene stampato un errore a schermo.z
	- buy(cart: Cart, productName: String, quantity: int): Aggiunge il prodotto avente nome "productName" all'oggetto Cart passato come parametro, rispettando i vincoli relativi alla disponibilità del prodotto e del budget di spesa del carrello. Se l'acquisto ha successo ed il prodotto in magazzino arriva a quantità 0, esso va rimosso dall'array.
