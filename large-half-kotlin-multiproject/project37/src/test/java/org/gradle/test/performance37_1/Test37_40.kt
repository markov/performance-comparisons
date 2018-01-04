package org.gradle.test.performance37_1

import org.junit.Assert.*

class Test37_40 {
    private val production = Production37_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}