package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_12 {
    private val production = Production15_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}