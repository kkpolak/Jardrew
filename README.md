Opis aplikacji:
Aplikacja służy do pracy biura firmy Jardrew, jest to firma zajmująca sie wytwarzaniem mebli drewnianych, głównie łóżek. Firma ma szeroki zakres produktów dostosowanych do klientów polskich oraz zagraniczynych z innych krajów Europy. 

Obsługa aplikacji:
Aplikacja jest obsługiwana poprzez używanie odpowiednich endpointów, w przyszłości endpointy będą obsługiwane od storny frontendowej, w tej chwili aby korzystać z aplikacji trzeba ręcznie korzystać z poszczególnych endpoitów.


Główne I ogólne funkcjonalności aplikacji:
    • obsługa bazy danych magazynu
    • obsługa bazy danych elementów
    • obsługa dokumentacji sprzedaży – system generacji faktur

Wzorce projektowe:

1. Facade – REST controller obsługujący endpointy słążace do obsługi danych z bazy danych korzysta z metod interface’u frontService. Ujednolica dostęp do metod service’u.
2. Dependency injection – wstrzykniecie interfejsu obsługującego strategię aktualizowania danych na temat stanu magazynu
3. MVC – struktura tworząca trzy warstwy obsługująca poszczególne elementy łóżek: model - modele elementów łóżka, view – sprawdzenie w przeglądarce różnych elementów(narazie tylko w formie wyświetlenia json’a), controller – kontrola elementów w bazie danych
4. Builder – budowanie poszczególnych elementów łóżka
5. Singleton – instancja połączenia z bazą danych
6. Observer – po aktualizacji bazy danych materiałów, ich ilości, zapotrzebowania oraz innych danych określa stan magazynu, w zależności od braków lub nadmiarów poszczególnych elementów bądź gotowych już elementów łóżka określa stan magazynu.
7. Template method – Facture saver: służy do generowania I zapisywania faktur w zależności od wymaganego rozszerznia, w tej chwili są opcje: txt, odt, pdf
8. Decorator – dekorator służący do tworzenia faktur, tworzy faktury w zależności od kraju oraz pozwala na wybór pewnych opcji, np loga firmy, zmiany nazw poszczególnych produktów dla poszczegolnych krajów itp.
9. Strategy – zmiana stanu magazynu na podstawie analizy ostatnich operacji w bazie danych
10. Factory – fabryka łózek, używa builderów poszczególnych elementów a końcowo produkuje całe łóżko z przekrojowymi danymi każdego elementu.


