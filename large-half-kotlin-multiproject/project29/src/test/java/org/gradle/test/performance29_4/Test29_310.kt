package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_310 {
    private val production = Production29_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}