package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_71 {
    private val production = Production10_71("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}