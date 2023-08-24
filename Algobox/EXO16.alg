<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" epaisseurPoint="2" arrondiAuto="vrai" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Grade EST_DU_TYPE NOMBRE" code="1#NOMBRE#Grade"/>
        <item algoitem="I EST_DU_TYPE NOMBRE" code="1#NOMBRE#I"/>
        <item algoitem="Max_Grade EST_DU_TYPE NOMBRE" code="1#NOMBRE#Max_Grade"/>
        <item algoitem="Min_Grade EST_DU_TYPE NOMBRE" code="1#NOMBRE#Min_Grade"/>
        <item algoitem="Total EST_DU_TYPE NOMBRE" code="1#NOMBRE#Total"/>
        <item algoitem="Nb_Grade EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nb_Grade"/>
        <item algoitem="Teacher_Entry EST_DU_TYPE NOMBRE" code="1#NOMBRE#Teacher_Entry"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="Nb_Grade PREND_LA_VALEUR 5" code="5#Nb_Grade#5#pasliste"/>
        <item algoitem="POUR I ALLANT_DE 1 A Nb_Grade" code="12#I#1#Nb_Grade">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER &quot;Veuillez entrer les notes de vos élèves (/20)&quot;" code="4#Veuillez entrer les notes de vos élèves (/20)#0"/>
            <item algoitem="LIRE Grade" code="2#Grade#pasliste"/>
            <item algoitem="AFFICHER &quot;Il vous reste &quot;" code="4#Il vous reste #0"/>
            <item algoitem="AFFICHERCALCUL Nb_Grade-I" code="20#Nb_Grade-I#0"/>
            <item algoitem="AFFICHER &quot; notes à entrer dans le programme\n&quot;" code="4# notes à entrer dans le programme\n#1"/>
            <item algoitem="Total PREND_LA_VALEUR Total +Grade" code="5#Total#Total +Grade#pasliste"/>
            <item algoitem="AFFICHER Total" code="3#Total#1#pasliste"/>
            <item algoitem="SI (I==1) ALORS" code="6#I==1">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="Max_Grade PREND_LA_VALEUR Grade" code="5#Max_Grade#Grade#pasliste"/>
                <item algoitem="Min_Grade PREND_LA_VALEUR Grade" code="5#Min_Grade#Grade#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (Grade>Max_Grade) ALORS" code="6#Grade>Max_Grade">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="Max_Grade PREND_LA_VALEUR Grade" code="5#Max_Grade#Grade#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (Grade&lt;Min_Grade) ALORS" code="6#Grade&lt;Min_Grade">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="Min_Grade PREND_LA_VALEUR Grade" code="5#Min_Grade#Grade#pasliste"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="Teacher_Entry PREND_LA_VALEUR -1" code="5#Teacher_Entry#-1#pasliste"/>
        <item algoitem="TANT_QUE (Teacher_Entry!= 000) FAIRE" code="15#Teacher_Entry!= 000">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot; ===== Menu ====== \n&quot;" code="4# ===== Menu ====== \n#1"/>
            <item algoitem="AFFICHER &quot;  666. Voir la note la plus mauvaise&quot;" code="4#  666. Voir la note la plus mauvaise#1"/>
            <item algoitem="AFFICHER &quot;  777. Voir la note la meilleure note&quot;" code="4#  777. Voir la note la meilleure note#1"/>
            <item algoitem="AFFICHER &quot;  888. Voir la moyenne&quot;" code="4#  888. Voir la moyenne#1"/>
            <item algoitem="AFFICHER &quot;  000.Sortir du Menu&quot;" code="4#  000.Sortir du Menu#1"/>
            <item algoitem="AFFICHER &quot;Votre choix : &quot;" code="4#Votre choix : #0"/>
            <item algoitem="LIRE Teacher_Entry" code="2#Teacher_Entry#pasliste"/>
            <item algoitem="SI (Teacher_Entry==666) ALORS" code="6#Teacher_Entry==666">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;La note la plus basse est &quot;" code="4#La note la plus basse est #0"/>
                <item algoitem="AFFICHER Min_Grade" code="3#Min_Grade#0#pasliste"/>
                <item algoitem="AFFICHER &quot; ! Bouh ! ○|￣|_ =3 \n\n&quot;" code="4# ! Bouh ! ○|￣|_ =3 \n\n#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (Teacher_Entry== 777) ALORS" code="6#Teacher_Entry== 777">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="AFFICHER &quot;La note la plus haute est &quot;" code="4#La note la plus haute est #0"/>
                        <item algoitem="AFFICHER Max_Grade" code="3#Max_Grade#0#pasliste"/>
                        <item algoitem="AFFICHER &quot; ! Bravo ! （＾∀＾●）ﾉｼ \n\n&quot;" code="4# ! Bravo ! （＾∀＾●）ﾉｼ \n\n#0"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (Teacher_Entry== 888) ALORS" code="6#Teacher_Entry== 888">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="AFFICHER &quot;La moyenne de la classe est de &quot;" code="4#La moyenne de la classe est de #0"/>
                                <item algoitem="AFFICHERCALCUL Total/Nb_Grade" code="20#Total/Nb_Grade#0"/>
                                <item algoitem="AFFICHER &quot;/20 \n\n&quot;" code="4#/20 \n\n#1"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                                <item algoitem="SINON" code="9#sinon">
                                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                    <item algoitem="AFFICHER &quot;Ben alors, on ne sait pas lire? la consigne est pourtant simple!\n\n&quot;" code="4#Ben alors, on ne sait pas lire? la consigne est pourtant simple!\n\n#0"/>
                                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                                </item>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
