package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_44 {
    private val production = Production15_44("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}