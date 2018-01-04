package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_183 {
    private val production = Production15_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}