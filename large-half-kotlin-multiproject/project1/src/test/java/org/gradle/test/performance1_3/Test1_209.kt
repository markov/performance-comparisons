package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_209 {
    private val production = Production1_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}