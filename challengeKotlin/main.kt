import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.sqrt
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.min

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun main(){
    // Write your code here
    // val phrase = "have a nice day"
    val phrase = "if man was meant to stay on the ground god would have given us roots"
    val phraseWithoutSpace = phrase.replace(" ", "")
    val phraseCount = phraseWithoutSpace.length
    val phraseSqrt = Math.sqrt(phraseCount.toDouble())
    var quantityLines = Math.floor(phraseSqrt).toInt()
    val quantityColumns = Math.ceil(phraseSqrt).toInt()
    if(quantityLines * quantityColumns < phraseCount) {
        quantityLines++
    }
    val wordsFormed = mutableListOf<String>()
    for(i in 0 until quantityLines){
        val wordFormed = phraseWithoutSpace.substring(quantityColumns * i, Math.min(quantityColumns * (i + 1), phraseCount))
        wordsFormed.add(wordFormed)
    }
    println(wordsFormed)
    var phraseCryptograph = ""
    for(i in 0 until quantityColumns){
        for(wordFormed in wordsFormed){
            if(wordFormed.length <= i){
                continue
            }
            phraseCryptograph += wordFormed[i]
        }
        phraseCryptograph += " "
    }
    println (phraseCryptograph)
}