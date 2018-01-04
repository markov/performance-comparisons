package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_100 {
    private val production = Production31_100("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}