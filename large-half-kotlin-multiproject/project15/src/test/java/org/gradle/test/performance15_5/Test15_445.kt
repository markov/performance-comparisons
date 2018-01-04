package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_445 {
    private val production = Production15_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}