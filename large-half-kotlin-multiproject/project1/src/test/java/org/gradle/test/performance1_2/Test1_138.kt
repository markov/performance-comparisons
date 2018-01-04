package org.gradle.test.performance1_2

import org.junit.Assert.*

class Test1_138 {
    private val production = Production1_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}