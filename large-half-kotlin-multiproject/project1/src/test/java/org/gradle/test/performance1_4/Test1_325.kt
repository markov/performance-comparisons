package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_325 {
    private val production = Production1_325("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}