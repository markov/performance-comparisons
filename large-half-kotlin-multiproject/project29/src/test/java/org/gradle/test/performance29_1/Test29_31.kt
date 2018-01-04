package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_31 {
    private val production = Production29_31("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}