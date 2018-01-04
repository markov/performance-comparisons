package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_104 {
    private val production = Production15_104("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}