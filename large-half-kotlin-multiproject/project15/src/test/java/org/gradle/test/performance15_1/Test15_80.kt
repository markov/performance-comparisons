package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_80 {
    private val production = Production15_80("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}