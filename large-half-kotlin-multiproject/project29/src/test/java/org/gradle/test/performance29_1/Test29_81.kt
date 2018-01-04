package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_81 {
    private val production = Production29_81("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}