package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_138 {
    private val production = Production15_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}