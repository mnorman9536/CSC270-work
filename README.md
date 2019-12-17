# *Les Misérables* by Victor Hugo
A citable digital edition.

### Bibliography
***
*Les Misérables*, by Victor Hugo.  Published by Thomas Y. Crowell & Co. in New York in 1887 and translated by Isabel F. Hapgood in 2008.

Victor Hugo was a 19th century French poet and novelist and is one of the best known French writers. Some of his most famous works are *Les Misérables* and *The Hunchback of Notre-Dame* with the former being one of the most renowned works of the 19th century.


A plain-text citable edition inteded for machine-processing has been validated and is available in ```text/lesMiserables_eng.cex```. A human readable website generated from the ```.cex``` file is located in ```html/```. The scripts that generated the site are located in ```/src/main/scala/```.

This version of this text is [in the Public Domain](http://creativecommons.org/publicdomain/zero/1.0/):

![license](http://i.creativecommons.org/p/zero/1.0/88x31.png)

Last edited 12-16-19.
### Running Scripts for Validation and Analysis
***
This repository is an SBT project for running Scala code.

###### Requirements
 + A Java JDK 1.8 or higher
 + [SBT](https://www.scala-sbt.org) installed and on PATH

###### Running
 + Clone this repository.
 + Navigate to the root.
 + ```$sbt console```
 + ```scala> :load scripts/character-validation.sc```
 + etc.

#### List of characters found in Les Misérables ordered by the number of appearances.
***

|Character                                                                           |Unicode|Appearances|
|------------------------------------------------------------------------------------|------|--------|
| e                                                                                  | 65   | 322125 |
| t                                                                                  | 74   | 220237 |
| a                                                                                  | 61   | 197746 |
| o                                                                                  | 6f   | 178527 |
| h                                                                                  | 68   | 168926 |
| n                                                                                  | 6e   | 164925 |
| i                                                                                  | 69   | 163305 |
| s                                                                                  | 73   | 155955 |
| r                                                                                  | 72   | 142918 |
| d                                                                                  | 64   | 105992 |
| l                                                                                  | 6c   | 96040  |
| u                                                                                  | 75   | 66360  |
| c                                                                                  | 63   | 61837  |
| m                                                                                  | 6d   | 55328  |
| f                                                                                  | 66   | 52816  |
| w                                                                                  | 77   | 52798  |
| ,                                                                                  | 2c   | 48293  |
| g                                                                                  | 67   | 45495  |
| p                                                                                  | 70   | 39367  |
| y                                                                                  | 79   | 37360  |
| b                                                                                  | 62   | 33858  |
| .                                                                                  | 2e   | 30067  |
| v                                                                                  | 76   | 23792  |
| k                                                                                  | 6b   | 13892  |
| T                                                                                  | 54   | 11016  |
| I                                                                                  | 49   | 8520   |
| “                                                                                  | 201c | 7099   |
| ”                                                                                  | 201d | 7014   |
| A                                                                                  | 41   | 6018   |
| ;                                                                                  | 3b   | 5857   |
| M                                                                                  | 4d   | 5836   |
| H                                                                                  | 48   | 5533   |
| -                                                                                  | 2d   | 4650   |
| C                                                                                  | 43   | 3792   |
| x                                                                                  | 78   | 3653   |
| ’                                                                                  | 2019 | 3596   |
| S                                                                                  | 53   | 3573   |
| !                                                                                  | 21   | 3511   |
| j                                                                                  | 6a   | 3292   |
| E                                                                                  | 45   | 3062   |
| W                                                                                  | 57   | 2967   |
| ?                                                                                  | 3f   | 2950   |
| B                                                                                  | 42   | 2912   |
| P                                                                                  | 50   | 2687   |
| —                                                                                  | 2014 | 2645   |
| :                                                                                  | 3a   | 2417   |
| J                                                                                  | 4a   | 2395   |
| O                                                                                  | 4f   | 2392   |
| R                                                                                  | 52   | 2391   |
| q                                                                                  | 71   | 2375   |
| F                                                                                  | 46   | 2342   |
| N                                                                                  | 4e   | 2213   |
| G                                                                                  | 47   | 2154   |
| _                                                                                  | 5f   | 2006   |
| L                                                                                  | 4c   | 1966   |
| V                                                                                  | 56   | 1890   |
| z                                                                                  | 7a   | 1828   |
| D                                                                                  | 44   | 1370   |
| é                                                                                  | e9   | 1315   |
| Y                                                                                  | 59   | 1080   |
| 1                                                                                  | 31   | 627    |
| U                                                                                  | 55   | 517    |
| 8                                                                                  | 38   | 384    |
| ‘                                                                                  | 2018 | 295    |
| è                                                                                  | e8   | 289    |
| X                                                                                  | 58   | 217    |
| K                                                                                  | 4b   | 214    |
| 3                                                                                  | 33   | 213    |
| 2                                                                                  | 32   | 207    |
| 0                                                                                  | 30   | 181    |
| 5                                                                                  | 35   | 173    |
| *                                                                                  | 2a   | 153    |
| 4                                                                                  | 34   | 142    |
| É                                                                                  | c9   | 136    |
| 7                                                                                  | 37   | 117    |
| Q                                                                                  | 51   | 115    |
| 6                                                                                  | 36   | 113    |
| æ                                                                                  | e6   | 104    |
| 9                                                                                  | 39   | 96     |
| (                                                                                  | 28   | 82     |
| )                                                                                  | 29   | 82     |
| ê                                                                                  | ea   | 73     |
| à                                                                                  | e0   | 57     |
| â                                                                                  | e2   | 56     |
| [                                                                                  | 5b   | 50     |
| ]                                                                                  | 5d   | 50     |
| Z                                                                                  | 5a   | 48     |
| ç                                                                                  | e7   | 48     |
| î                                                                                  | ee   | 39     |
| ü                                                                                  | fc   | 37     |
| œ                                                                                  | 153  | 35     |
| ô                                                                                  | f4   | 33     |
| vertical bar                                                                       | 7c   | 24     |
| ï                                                                                  | ef   | 18     |
| ù                                                                                  | f9   | 18     |
| ,                                                                                  | 22   | 15     |
| Æ                                                                                  | c6   | 10     |
| û                                                                                  | fb   | 9      |
|ë                                                                                   | eb   | 5      |
|+                                                                                   | 2b   | 5      |
|À                                                                                   | c0   | 4      |
|È                                                                                   | c8   | 3      |
|Œ                                                                                   | 152  | 2      |
|Ç                                                                                   | c7   | 2      |
|ñ                                                                                   | f1   | 2      |
|…                                                                                   | 2026 | 1      |
|Ü                                                                                   | dc   | 1      |
|½                                                                                   | bd   | 1      |

Confirm validation using: ```$ sbt console
scala> :load scripts/character-validation.sc```
This will generate the ```charTable.md```

***

###### Ngram Analysis
Ngrams are recurring patterns of n words. This repository contains a Scala script showing how ngram analysis can work with the [CITE Architecture](http://cite-architecture.org).

This analysis can be executed by running any of the ```scripts/ngrams_.sc``` files in the ```$ sbt console```.

# Acknowledgments
Special thanks to Dr. Christopher Blackwell for writing many of the scripts and for providing many of the libraries used throughout our project. Additionally I would like to thank Will Blackwell for assisting with debugging and for his assistance with character validation.
