package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_421 {
    private val production = Production26_421("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}