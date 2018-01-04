package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_41 {
    private val production = Production34_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}