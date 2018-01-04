package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_310 {
    private val production = Production19_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}