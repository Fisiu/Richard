package pl.fidano.java.utils;

import java.util.*;

public class Sentences {

    private static final String[] SOURCE = {
            "Zrób to, zanim będziesz gotów, gdyż nigdy nie będziesz gotów, jeśli będziesz czekać|Les Brown",
            "Wszystko, czego pragniesz jest po drugiej stronie strachu|George Addair",
            "Jesteś jedyną osobą na świecie, która może wykorzystać Twój potencjał|Zig Ziglar",
            "Zawsze zastanawiałem się, dlaczego ptaki zostają w tym samym miejscu, skoro mogą latać po całym świecie. Potem zadałem to samo pytanie sobie|Harun Yahya",
            "Kto nie chce, kiedy może, ten nie będzie mógł, kiedy będzie chciał|Winston Churchill",
            "Nigdy nie rezygnuj z celu tylko dlatego, że osiągnięcie go wymaga czasu. Czas i tak upłynie|H. Jackson Brown Jr. ",
            "Każdy artysta zaczynał kiedyś jako amator|Ralph Waldo Emerson",
            "Porażka jest po prostu okazją, by spróbować ponownie, tym razem bardziej przemyślanie|Henry Ford ",
            "Nawet najdłuższa podróż zaczyna się od pierwszego kroku|Laozi ",
            "Nie popełnia błędu tylko ten, kto nic nie robi|Teodor Roosevelt",
            "Nie uda Ci się przepłynąć oceanu dopóki nie zdobędziesz odwagi, by stracić z oczu widok lądu|Krzysztof Kolumb",
            "Poddający się - nigdy nie wygrywa, a wygrywający - nigdy się nie poddaje|Napoleon Hill",
            "Gdy zamykają się jedne drzwi do szczęścia, otwierają się inne; ale często tak długo patrzymy na zamknięte drzwi, że nie dostrzegamy tych, które zostały otwarte|Helen Keller",
            "Naszą największą słabością jest poddawanie się. Najpewniejszą drogą do sukcesu jest zawsze próbowanie jeden, kolejny raz|Thomas Alva Edison",
            "Gdy wszyscy wiedzą, że coś jest niemożliwe, przychodzi ktoś, kto o tym nie wie i to robi|Albert Einstein",
            "Jeżeli uważasz, że możesz czegoś dokonać albo przeciwnie, że nie dasz rady - w obu przypadkach masz rację|Henry Ford",
            "Za dwadzieścia lat będziesz bardziej rozczarowany rzeczami, których nie zrobiłeś niż tymi, które zrobiłeś źle|Mark Twain",
            "Jest tylko jeden sposób na uniknięcie krytyki: nic nie robić, nic nie mówić i być nikim|Arystoteles",
            "Twój czas jest ograniczony, więc nie marnuj go na życie czyimś życiem|Steve Jobs",
            "Nie martw się porażkami, martw się szansami, które tracisz, gdy nawet nie próbujesz|Jack Canfield",
            "Jeśli nie potrafisz robić wielkich rzeczy, rób małe rzeczy w wielki sposób|Napoleon Hill",
            "Zawsze sie znajdzie odpowiednia filozofia do braku odwagi|Albert Camus",
            "Bądź wdzięczny za to, co masz, a będziesz miał tego więcej. Jeśli koncentrujesz się na tym, czego nie masz, nigdy nie będziesz miał wystarczająco dużo|Oprah Winfrey",
            "Jesteśmy odzwierciedleniem pięciu osób, z którymi spędzamy najwięcej czasu. To oni nas motywują, doradzają, krytykują. Przyjrzyj się, z kim Ty przestajesz|Nancy Drew",
            "O naszym szczęściu nie decyduje to, co nam się przydarza, ale to, jak na to reagujemy|Andrew Matthews",
            "Szczęscie jest decyzją, nie punktem na mapie|Andrew Matthews",
            "Powodem dla którego tak niewielu ludzi odnosi sukces jest to,że nikt nie wymyślił jeszcze sposobu umożliwiającego siedzenie i jednoczesne ślizganie się w górę|W. Clement Stone",
            "Sukces to nie kwestia wrodzonego talentu, błyskotliwej inteligencji ani szczęścia. Sukcesy odnoszą ludzie przekonani o tym, że wciąż mogą się wiele nauczyć|Carol Dweck",
            "W życiu nie chodzi o czekanie, aż burza minie. Chodzi o to, by nauczyć się tańczyć w deszczu|Vivian Green",
            "Inspiracja istnieje, ale musi Cię zastać przy pracy|Pablo Picasso",
            "Jesteś odpowiedzialny nie tylko za to, co mówisz, ale również za to, czego nie mówisz|Martin Luther",
            "Nic nie jest szczególnie trudne do zrobienia, jeśli tylko rozłożyć to na etapy|Henry Ford",
            "Miej podejście właściwe studentom: nigdy nie bądź zbyt wielkim, by zadawać pytania, nigdy nie wiedz zbyt dużo, by nauczyć się czegoś nowego|Og Mandino",
            "Choć nikt nie może cofnąć się w czasie i zmienić początku na zupełnie inny, to każdy może zacząć dziś i stworzyć całkiem nowe zakończenie|Carl Bard",
            "Zacznij od robienia tego, co konieczne; potem zrób to, co możliwe; nagle odkryjesz, że dokonałeś niemożliwego|św. Franciszek z Asyżu",
            "Sukces to drabina, po której nie sposób wspiąć się z rękami w kieszeniach|Philip Wylie",
            "Statek w porcie jest bezpieczny, ale nie po to buduje się statki|Grace Murray Hopper",
            "Szaleństwem jest robić wciąż to samo i oczekiwać różnych rezultatów|Albert Einstein",
            "Jeśli w życiu brakuje miejsca na odwagę, to inne cnoty są bez znaczenia|Winston Churchill",
            "Życie jest długie i nudne, jeśli nie przeżywa się go tak, jakby się chciało|Laurent Gounelle",
            "Aby zapalać innych, samemu trzeba płonąć|Jacek Walkiewicz",
            "Sposobem na zaczęcie jest skończenie mówienia i podjęcie działania|Walt Disney",
            "Nie bój się dużego kroku. Nie pokonasz przepaści dwoma małymi|David Lloyd George",
            "Umysły są jak spadochrony – działają tylko gdy są otwarte|Thomas Dewar",
            "Tylko głupiec nie ma wątpliwości|Karel Capek",
            "Początek jest najważniejszą częścią pracy|Platon",
            "Nie oczekujcie od dnia tego, co mogą dać jedynie lata. Ale nie zapominajcie, że lata składają się z wielu dni, dlatego postanówcie, że nie zmarnujecie ani jednego dnia|Johan Michael Sailer",
            "Nic, co ma wielką wartość w życiu nie przychodzi łatwo|Norman Vincent Peale",
            "Ludzie, którzy tracą czas, czekając aż zaistnieją najbardziej sprzyjające warunki, nigdy nic nie zdziałają|Mark Fisher",
            "Cel to nic innego, jak marzenie z terminem realizacji|Joe L. Griffith",
            "To nie to, co masz, ani to, kim jesteś, ani to, gdzie jesteś, ani co robisz czyni Cię szczęśliwym bądź nieszczęśliwym. Chodzi o to, o czym myślisz|Dale Carnegie",
            "Czy jest ktoś, kogo chciałbyś zmienić, poinstruować, ulepszyć? Świetnie! Jestem za! Ale dlaczego nie zaczniesz od siebie?|Dale Carnegie",
            "W dwa miesiące możesz zdobyć więcej przyjaciół, interesując się innymi ludźmi, niż w ciągu dwóch lat, usiłując zainteresować sobą innych|Dale Carnegie",
            "Życie to 10% tego, co nam się przydarza i 90% tego, jak na to reagujemy. Nasze podejście jest wszystkim|Charles Swindoll",
            "Gdy nie wiesz, do którego portu płyniesz, żaden wiatr nie jest dobry|Seneka",
            "Sukces nie jest kluczem do szczęścia, ale szczęście jest kluczem do sukcesu|Albert Schweitzer",
            "Krytykować, potępiać i narzekać potrafi każdy głupiec – i większość głupców tak robi. Ale aby zrozumieć i darować, potrzeba charakteru i samokontroli|Dale Carnegie",
            "Czasami od myślenia odstrasza nas nie związany z nim wysiłek, lecz wnioski, do jakich moglibyśmy dojść|Robert Cialdini",
            "Nie znam klucza do sukcesu, ale kluczem do klęski jest próba zadowolenia wszystkich|Bill Cosby",
            "Pomysły są powszechnym towarem. Wprowadzanie ich w życie nie jest|Michael Dell",
            "Skoro i tak będziesz myśleć, myśl odważnie|Donald Trump",
            "Istnieją tylko dwa dni w roku, w których nic nie może być zrobione. Jeden nazywamy \"wczoraj\", a drugi \"jutro\". \"Dzisiaj\" to właściwy dzień, aby kochać, wierzyć i żyć w pełni|Dalai Lama",
            "“Kiedyś” to choroba, która każe nam zabrać wszystkie nasze marzenia do grobu|Tim Ferriss",
            "Nie chcę pod koniec życia stwierdzić, że przeżyłam tylko jego długość. Chcę przeżyć też pełną jego szerokość|Diane Ackerman",
            "A jak wyjdzie śmiesznie? Ludzie się pośmieją i koniec. Wielkość nie boi się śmieszności|Tadeusz Różewicz",
            "Motywacja pozwala wystartować. Nawyk utrzymuje w ruchu|Jim Ryun",
            "Widzimy ludzi, którzy zgromadzili wielkie fortuny ale często oglądamy tylko ich triumf, pomijając porażki i przeszkody które spotykały ich po drodze|Napoleon Hill",
            "To, co powstrzymuje ludzi, to nie jakość ich pomysłów, tylko brak wiary w siebie|Russell Simmons",
            "To, czego boimy się najbardziej, jest z reguły tym, co właśnie powinniśmy zrobić|Ralph Waldo Emerson",
            "Nie wystarczy być we właściwym czasie, we właściwym miejscu. Trzeba być jeszcze właściwie przygotowanym|Jacek Chmielecki",
            "Bądź tak dobry, by nie mogli Cię dłużej ignorować|Steve Martin",
            "Ludzie na ogół dają się łatwiej przekonać przez argumenty, na które sami wpadli, niż przez te, które ktoś im narzucił|Blaise Pascal",
            "Poświęcaj tyle czasu na ulepszanie siebie, byś nie miał go na krytykę innych|Christian D. Larson",
            "Jedynymi osobami, z którymi powinieneś wyrównać rachunki są ci, którzy Ci pomogli|John E. Southard"
    };
    private List<Sentence> sentences;

    public Sentences() {
        sentences = new ArrayList<>();
        Arrays.stream(SOURCE).forEach(str -> {
            final String s[] = str.split("\\|");
            sentences.add(new Sentence(s[0], s[1]));
        });
    }

    public Sentence getRandomSequence() {
        Random rnd = new Random();
        return sentences.get(rnd.nextInt(sentences.size()));
    }

}
