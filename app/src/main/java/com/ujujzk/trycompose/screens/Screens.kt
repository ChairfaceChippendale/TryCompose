package com.ujujzk.trycompose.screens

sealed class Screen(val route: String, val title: String) {
    object DicParent : Screen("dic_parent", "Dictionary")
    object Translate : Screen("translate", "Translate")
    object Catalog : Screen("catalog", "Catalog")

    object VocParent : Screen("voc_parent", "Vocabulary")
    object EditPack : Screen("editpack", "EditPack")
    object Pack : Screen("pack", "Pack")
    object Learn : Screen("learn", "Learn")

}