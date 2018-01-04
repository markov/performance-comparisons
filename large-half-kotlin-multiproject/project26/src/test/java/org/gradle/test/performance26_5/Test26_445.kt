package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_445 {
    private val production = Production26_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}