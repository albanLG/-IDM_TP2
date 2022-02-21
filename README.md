# IDM-TP2
IDM Projet DSL pour JSON

Qian Ma, Curtis klomegan,Alban Le goff, Arthur Lalande marchand

## Presentation
Notre projet IDM "jppjson" est un DSL pouvant se compiler vers Java ou du Scala en utilisant librairie JackSon. Il paut créer pour pouvoir manupiler des fichiers JSON.Jppjson permets de  modifier, supprimer des éléments dans un fichier JSON et aussi exporter fichier JSON ver fichier txt et csv.

## Exemple


'''
Load("testvide.json"){
			AddElement("hello","world");
		}
'''

nous avons ajouter un objet JSON dans testvide.json avec key= "hello" et value="world" .

'''
Load("testvide.json"){
			ExportCSV("export.csv");
		}
'''

nous avons exporter testvide.json en export.csv.
Attention, à cause de limite du performance Jackson, nous pouvons pas convertir des fichiers JSON trop complexe.

'''
Load("testvide.json"){
			ExportString("export.txt");
		}
'''

nous avons exporter tous les contenus de testvide.json en export.txt.
