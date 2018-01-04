package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_183 {
    private val production = Production26_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}