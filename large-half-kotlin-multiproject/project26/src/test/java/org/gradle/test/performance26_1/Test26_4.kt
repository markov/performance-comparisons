package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_4 {
    private val production = Production26_4("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}