package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_167 {
    private val production = Production26_167("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}