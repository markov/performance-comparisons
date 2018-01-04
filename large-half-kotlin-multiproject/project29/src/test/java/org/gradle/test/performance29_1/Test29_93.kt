package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_93 {
    private val production = Production29_93("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}