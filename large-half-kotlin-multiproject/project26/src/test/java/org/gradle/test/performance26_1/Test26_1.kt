package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_1 {
    private val production = Production26_1("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}