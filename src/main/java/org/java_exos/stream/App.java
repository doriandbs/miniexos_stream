package org.java_exos.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) {
        /*List<Integer> ages = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> names = Arrays.asList("Dorian", "Kevin", "Milan", "Gulsum","Emilie");
        System.out.println("Ages *************");

        Stream<Integer> filteredStream = ages.stream().filter(age -> age > 3);
        System.out.println(filteredStream);

        Stream<Integer> mappedStream = ages.stream().map(age -> age * 2);
        System.out.println(mappedStream);

        System.out.println("*************");
        int sum = ages.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("*************");

        Optional<Integer> max = ages.stream().max(Integer::compare);
        System.out.println(max);



        System.out.println("Noms *************");
        List<String> filteredNames = names.stream().filter(name -> name.length() > 3).toList();
        System.out.println(filteredNames);

        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(upperCaseNames);
        System.out.println("Sommes avec reduce *************");

        int sum2 = ages.stream().reduce(0,Integer::sum);
        System.out.println(sum2);
        System.out.println("Sorted *************");

        List<String> sorted = names.stream().sorted().toList();
        System.out.println(sorted);


        System.out.println("*****************************");

        int somme=0;
        for(int valeur : ages) {
            if(valeur<29){
                somme+=valeur;
            }
        }
        System.out.println(somme);
        int somme3 = ages.parallelStream().filter(a->a<29).mapToInt(i->i).sum();
        System.out.println(somme3);
        int somme4 = ages.parallelStream().filter(a->a<29).mapToInt(i->i).sum();
        System.out.println(somme4);*/


        /*EXO*/
        /*
         * Créer une classe personne composé d'un nom, une énumération de genre, et une taille en cm
        * écrire un algo sans stream pour :
        *
        *
        * afficher le total de la taille des femmes
        * afficher la moyenne de la taille des hommes
        *
        *
        * ------------------------------
        *
        * v2 : la même chose mais avec l'api STREAM
        *
        * */

        /*Personne p1 = new Personne("Dorian", Genre.HOMME, 170);
        Personne p3 = new Personne("KevinL", Genre.HOMME, 175);
        Personne p4 = new Personne("KevinG", Genre.HOMME, 176);
        Personne p5 = new Personne("Milan", Genre.FEMME, 165);
        Personne p6 = new Personne("Gulsum", Genre.FEMME, 168);
        Personne p7 = new Personne("Emilie", Genre.FEMME, 175);
        List<Personne> personnes = Arrays.asList(p1,p3,p4,p5,p6,p7);
        int totalFemmes = 0;
        double moyenneHommes = 0;
        int nbHommes=0;
        for(int i=0;i<personnes.size();i++) {
            if(personnes.get(i).getGenre() == Genre.FEMME) totalFemmes+=personnes.get(i).getTaille();
            else{
                nbHommes++;
                moyenneHommes+=personnes.get(i).getTaille();
            }
        }
        moyenneHommes/=nbHommes;
        System.out.println(moyenneHommes);
        System.out.println(totalFemmes);

        double tailleMoyenne = personnes
                .stream()
                .filter(personne -> personne.getGenre() == Genre.HOMME)
                .mapToDouble(Personne::getTaille)
                .average()
                .getAsDouble();
        System.out.println(tailleMoyenne);

        double totalTailleFemmes = personnes
                .stream()
                .filter(personne -> personne.getGenre() == Genre.FEMME)
                .mapToDouble(Personne::getTaille)
                .sum();
        System.out.println(totalTailleFemmes);

        Map<Genre, List<Personne>> peopleByGender = personnes
                .stream()
                .collect(
                        Collectors.groupingBy(Personne::getGenre)
                );

        afficherInfos(peopleByGender,Genre.FEMME);
        afficherInfos(peopleByGender,Genre.HOMME);
        List<Personne> sorted = personnes.stream()
                .filter(personne -> personne.getGenre() == Genre.HOMME)
                .sorted(comparingDouble(Personne::getTaille).reversed()).toList();

        System.out.println("**************************");
        for(Personne personne : sorted) {
            System.out.println(personne.getNom());
        }*/

    /*
    imaginez une liste d'élement ex ("nom1","nom2",...)
    afficher en majuscule dans l'ordre croissant uniquement les élements qui commencent par la lettre M

     */
        List<String> noms = Arrays.asList("momo","Momo","Manon","Michael");
        List<String> majuscules = noms.stream().filter(nom -> nom.startsWith("M")).sorted().toList();
        System.out.println(majuscules);

        

    }
   /* private static void afficherInfos(Map<Genre,List<Personne>> peopleByGender, Genre genre) {
        List<Personne> genresList = peopleByGender.getOrDefault(genre,new ArrayList<>());
            if(!genresList.isEmpty()){
                double totalTaille = genresList.stream().mapToDouble(Personne::getTaille).sum();
                double moyenneTaille = totalTaille/genresList.size();
                System.out.println("taille totale de " + genre + " : " + totalTaille);
                System.out.println("taille moyenne de " + genre + " : " + moyenneTaille);
            }
            else System.out.println("Erreur");
    }*/


}
