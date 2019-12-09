package com.example.myroomdb

import androidx.lifecycle.LiveData


class WordRepository(private val WordDao: WordDao) {
    val allWord: LiveData<List<Word>>=wordDao.getAlphabetizedWords()
    suspend fun insert(Word: Word) {
        WordDao.insert(Word)
    }
}