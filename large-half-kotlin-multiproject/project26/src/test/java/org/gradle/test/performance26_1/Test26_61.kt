package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_61 {
    private val production = Production26_61("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}