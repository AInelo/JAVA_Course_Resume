# JAVA COLLECTIONS

Les collections en Java fournissent des structures de données pour stocker et manipuler des groupes d'objets. Elles offrent une alternative aux tableaux (Array) et sont plus flexibles et dynamiques.

## Interfaces de Base

Les principales interfaces de base dans le framework de collections Java sont :

- List : Collection ordonnée qui permet les doublons.

```bash
List<String> liste = new ArrayList<>();
liste.add("Java");
liste.add("Python");
liste.add("C++");
System.out.println(liste); // Output: [Java, Python, C++]

```

Set : Collection qui ne permet pas de doublons.
Map : Structure clé-valeur.

Implémentations : Chaque interface a plusieurs implémentations. Par exemple :

ArrayList, LinkedList : Implémentations de List.
HashSet, TreeSet : Implémentations de Set.
HashMap, TreeMap : Implémentations de Map.
Méthodes Principales : Les collections offrent de nombreuses méthodes pour ajouter, supprimer, rechercher et parcourir des éléments. Par exemple :

```bash
add() pour ajouter des éléments.
remove() pour supprimer des éléments.
contains() pour vérifier si un élément est présent.
iterator() pour parcourir les éléments.
Itérateurs : Les itérateurs sont utilisés pour parcourir les éléments d'une collection de manière séquentielle.
```
