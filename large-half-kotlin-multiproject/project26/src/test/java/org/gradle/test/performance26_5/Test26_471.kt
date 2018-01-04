package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_471 {
    private val production = Production26_471("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}