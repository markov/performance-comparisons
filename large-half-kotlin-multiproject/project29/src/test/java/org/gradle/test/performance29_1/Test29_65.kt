package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_65 {
    private val production = Production29_65("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}