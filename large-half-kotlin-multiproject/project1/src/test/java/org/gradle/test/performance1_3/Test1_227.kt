package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_227 {
    private val production = Production1_227("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}