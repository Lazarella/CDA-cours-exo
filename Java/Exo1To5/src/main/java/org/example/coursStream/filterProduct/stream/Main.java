package org.example.coursStream.filterProduct.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1. Déclarer et nettoyer le texte
        String string = "Dès 1830, Paris s'active. Elle renverse le conservateur Charles X et met en place Louis-Philippe, que l'on appelle le Roi citoyen. Il met en avant le principe de souveraineté nationale, ce qui est la première entorse au Congrès de Vienne qui instaurait le droit d'ingérence. La Pologne, la Belgique, l'Allemagne et l'Italie vont se révolter. Il y a une volonté d'unité nationale chez les trois derniers, d'indépendance chez les premiers. Les paroles du Chant des Allemands sont écrites à cette époque, en 1841. En Italie, on rêve de l'époque antique où l'Italie était unie. C'est le Risorgimento, c'est-à-dire la résurrection. À l'époque, les carbonari sont un puissant mouvement politique italien, bien qu'illégal (combattu à la fois par la Sardaigne et par l'empire d'Autriche). Giuseppe Mazzini, activiste et un des grands dirigeants de ces carbonari, a une forte volonté. Il tente de réaliser l'unité italienne sous la République romaine, avec son ami Garibaldi, mais il échouera. Le compositeur Verdi écrira de la musique italienne pour une Italie unie. Opposé à l'idée d'une indépendance, Metternich déclare : « l'Italie n'est pas un pays mais un terme de géographie » ; Victor Hugo réplique et dit aux Italiens : « N'ayez qu'une pensée, vivre chez vous de votre vie à vous »3.";

        String cleanStr = cleanString(string);


                // 2. ttt par stream

        Map<String, Long> wordCount = countWords(cleanStr);
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));

        Map<String, Long> wordOrdered = filterWordsByLength(cleanStr, 4);
        System.out.println(wordOrdered);

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(cleanStr.split("\\s+")));
        System.out.println(uniqueWords);


        Stream<String> wordsStream = Arrays.stream(cleanStr.split("\\s+")).distinct();

        Optional<String> smallestWord = wordsStream.min(Comparator.comparingInt(String::length));
        smallestWord.ifPresent(word -> System.out.println("Le plus petit mot contient: " + word.length()+"caractères"));


        wordsStream = Arrays.stream(cleanStr.split("\\s+")).distinct();

        Optional<String> longestWord = wordsStream.max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(word -> System.out.println("Mot le plus long: " + word.length()+" caractères"));

        OptionalDouble averageWordLength = Arrays.stream(cleanStr.split("\\s+"))
                .distinct()
                .mapToInt(String::length)
                .average(); //check summaryStatistics(), c'est bien plus simple
        averageWordLength.ifPresent(avg -> System.out.println("Longueur moyenne des mots: " + String.format("%.2f", avg)));

            }
    public static String cleanString(String str) {
        return str.replaceAll("\\p{Punct}", "").toLowerCase();
    }
    public static Map<String, Long> countWords(String str) {
        return Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
    public static Map<String, Long> filterWordsByLength(String str, int wordLength) {
        return Arrays.stream(str.split("\\s+"))
                .filter(word -> word.length() == wordLength)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}

