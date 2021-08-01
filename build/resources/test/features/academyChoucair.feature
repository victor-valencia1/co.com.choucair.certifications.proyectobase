# Autor: xxxxxxxxx
@stories
Feature:  Academy Choucair
  As a user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for automation course
    Given than Rose want to learn automation at the Academy choucair
    | strUser     |strPassword  |
    | TuUsuario   |TuClave      |
    When she search for the course on the choucair Academy platfrom
    |strCourse                |
    |Metodologia Bancolombia  |
    Then she find the course called
    |strCourse               |
    |Metodologia Bancolombia |


    # When she search for the course on the choucair Academy platfrom
    #    |strCourse    |
    #    |<strCourse>  |
    #    Then she find the course called
    #    |strCourse    |
    #    |<strCourse>  |

  #example:
  # |strUser | strPassword  | StrCourse              |
  # |rpenaa  | Febrero.2000 | Mtodología Bancolombia |
