package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_310 {
    private val production = Production15_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}