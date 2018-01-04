package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_484 {
    private val production = Production7_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}