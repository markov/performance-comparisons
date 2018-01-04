package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_465 {
    private val production = Production26_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}