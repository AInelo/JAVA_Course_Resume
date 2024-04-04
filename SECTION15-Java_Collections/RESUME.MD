# JAVA COLLECTIONS

Les collections en Java fournissent des structures de données pour stocker et manipuler des groupes d'objets. Elles offrent une alternative aux tableaux (Array) et sont plus flexibles et dynamiques.

## Interfaces de Base

Les principales interfaces de base dans le framework de collections Java sont :

- ### List : Collection ordonnée qui permet les doublons.

```bash
List<String> liste = new ArrayList<>();
liste.add("Java");
liste.add("Python");
liste.add("C++");
System.out.println(liste); // Output: [Java, Python, C++]
```

- ### Set : Collection qui ne permet pas de doublons.

```bash
Set<String> ensemble = new HashSet<>();
ensemble.add("Rouge");
ensemble.add("Bleu");
ensemble.add("Rouge");
System.out.println(ensemble); // Output: [Bleu, Rouge]
```

- ### Map : Structure clé-valeur.

```bash
Map<String, Integer> map = new HashMap<>();
map.put("Java", 1);
map.put("Python", 2);
map.put("C++", 3);
System.out.println(map.get("Java")); // Output: 1
```

## Implémentations : Chaque interface a plusieurs implémentations.

```bash
List<String> liste = new ArrayList<>();
liste.add("Java");
liste.add("Python");

```

```bash
Set<String> ensemble = new HashSet<>();
ensemble.add("Rouge");
ensemble.add("Bleu");

```

```bash
Map<String, Integer> map = new HashMap<>();
map.put("Java", 1);
map.put("Python", 2);

```

## Méthodes Principales :

```bash
add() : Ajoute un élément à la collection.
remove() : Supprime un élément de la collection.
contains() : Vérifie si un élément est présent dans la collection.
iterator() : Permet de parcourir les éléments de la collection.
```

## Classes utilitaires :

La classe Collections fournit des méthodes utilitaires telles que sort(), reverse(), shuffle(), etc.

```bash
List<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(1);
numbers.add(2);
Collections.sort(numbers);
System.out.println(numbers); // Output: [1, 2, 3]
```