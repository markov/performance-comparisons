package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_94 {
    private val production = Production15_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}