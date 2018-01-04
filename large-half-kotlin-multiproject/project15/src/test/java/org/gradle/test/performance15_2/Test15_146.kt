package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_146 {
    private val production = Production15_146("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}